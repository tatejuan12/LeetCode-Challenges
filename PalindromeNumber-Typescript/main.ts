console.log(isPalindrome(-121));

function isPalindrome(x: number): boolean {
  if (x < 0) return false;
  var j: number = 0,
    temp: number = x;

  for (var i = 0; temp != 0; i++) {
    var lastNum = temp % 10;
    j = j * 10 + lastNum;
    temp = Math.floor(temp / 10);
  }
  return x == j;
}
