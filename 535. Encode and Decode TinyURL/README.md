## [題目來源：LeetCode - 535. Encode and Decode TinyURL](https://leetcode.com/problems/encode-and-decode-tinyurl/#/description) ##


## 題目： ##

> TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
> 
> Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

## 粗略翻譯： ##
> TinyURL是較短的URL
> 
> 例如將一URLhttps://leetcode.com/problems/design-tinyurl編碼後會變成http://tinyurl.com/4e9iAk的TinyURL
> 
> 而TinyURLhttp://tinyurl.com/4e9iAk解碼後會還原成https://leetcode.com/problems/design-tinyurl的URL
> 
> 程式目的為設計此一編碼及解碼的演算法，且並不限制任何的條件，只需要確保URL可以編碼成TinyURL
> 
> 而TinyURL可以解碼回URL即可。


----------


## 解法： ##
一開始想到的是直接用Array去儲存所有的URL，並用Array的Length來當作TinyURL的編號

解碼時在根據TinyURL的編號作為Array的index，並取出原來的URL，虛擬碼大約如下所示：

    var array = new Array()
    
    func encode(url: String) -> String {
      array.add(url)
      return "http://tinyurl.com/" + array.length()
    }
    
    func decode(tinyUrl: String) -> String {
      return array[ tinyUrl.subString( tinyUrl.lestIndexOf("/") + 1 )]
    }

雖然這方法上傳到LeetCode後沒有報錯，也成功解出來，

但不可否認這方法有滿多缺點的，例如：

同樣的URL如不斷的encode會被編成不同的TinyURL，造成記憶體浪費
使用者可以藉由TinyURL的編號知道有多少URL被編碼
如不考慮執行時間的話，要解決上述問題我個人是選擇用兩個hashMap去儲存，例如tinyUrlHashMap、urlHashMap

tinyUrlHashMap的key為URL，Value為TinyURL
urlHashMap的key為TinyURL，Value為URL
將URL編碼前可以先檢查tinyUrlHashMap是否有同樣的key，如果有則直接取出value並return

如果沒有則進行編碼，而編碼的方式可以隨機從[a-z, A-Z, 0-9]等共62的字元中隨機挑選X個，例如挑選6個，這樣一來可以有56,800,235,584種組合，每次編碼完後一樣要檢查tinyUrlHashMap是否有同樣的key，如果有就再一次的重新編碼，直到沒有重複為止。

編碼完成後將要將TinyURL儲存到urlHashMap，之後要將TinyURL解碼回URL，只需要從urlHashMap取出對應的value即可

雖然這方法會有 "因為重複，所以不斷重新編碼" 的情況發生，但是機率實在太低了

何況我們還可以改挑選7個字元，這樣一共會有3,521,614,606,208種組合

那就更不可能重複了



不曉得各位高手是否有其他的更佳解?

可以的話希望能指教一下

謝謝。

----------

網站：[http://wp.mlab.tw/](http://wp.mlab.tw/)

GitHub：[https://github.com/yoll522/LeetCode](https://github.com/yoll522/LeetCode "https://github.com/yoll522/LeetCode")
