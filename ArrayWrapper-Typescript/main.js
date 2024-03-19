var ArrayWrapper = /** @class */ (function () {
    function ArrayWrapper(nums) {
        this.numbers = nums;
    }
    ArrayWrapper.prototype.valueOf = function (obj3, obj4) {
        if (this.numbers.length == 0)
            return 0;
        return this.numbers.reduce(function (prev, curr) { return prev + curr; });
        // return this._nums.reduce((sum,n) => sum+n, 0)
    };
    ArrayWrapper.prototype.toString = function () {
        return "[" + this.numbers.toString() + "]";
    };
    return ArrayWrapper;
}());
var obj1 = new ArrayWrapper([1, 2]);
var obj2 = new ArrayWrapper([4, 3]);
console.log(obj1 + obj2); // 10
String(obj1); // "[1,2]"
String(obj2); // "[3,4]"
//# sourceMappingURL=main.js.map