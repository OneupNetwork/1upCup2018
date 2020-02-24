## 1up Cup 2018
![](https://img.shields.io/badge/date-2018--07--13-0385B1.svg)

### Problems

- [Chocobo - Uncowed Forces](https://codeforces.com/problemset/problem/604/A)
- [Ifrit - Passwords](https://codeforces.com/problemset/problem/721/B)
- [Moogle - The Text Splitting](https://codeforces.com/problemset/problem/612/A)
- [Shiva - One Bomb](https://codeforces.com/problemset/problem/699/B)
- [Sylph - Wet Shark and Odd and Even](https://codeforces.com/problemset/problem/621/A)

#### [Shiva - One Bomb](https://codeforces.com/problemset/problem/699/B)
牆如果可以被炸到，其 x 或 y 座標必定有一個與炸彈相同，所以只需在牆的 x 與 y 座標組合中判斷是否與所有的牆皆有至少其中一個相同，此組合即為解。
同時當第一堵與最後一堵牆之座標所圍成的區域內有其他牆時，必定是 NO，可以不進去迴圈判斷。(測資 66 會給予整張都是牆的地圖，沒有預先判斷直接進入迴圈會 TLE)
