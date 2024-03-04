"use strict";
console.log(isPalindrome(-121));
function isPalindrome(x) {
    if (x < 0)
        return false;
    var j = 0, temp = x;
    for (var i = 0; temp != 0; i++) {
        var lastNum = temp % 10;
        j = j * 10 + lastNum;
        temp = Math.floor(temp / 10);
    }
    return x == j;
}
//# sourceMappingURL=main.js.map