// type F = (x: number) => number;
function compose(functions) {
    var target = 0;
    return function (x) {
        if (functions.length == 0)
            return x;
        target += functions.pop()(x);
        target = compose(functions)(target);
        return target;
    };
}
var fn = compose([function (x) { return x + 1; }, function (x) { return x * x; }, function (x) { return 2 * x; }]);
console.log("Final 1: " + fn(4));
var fn2 = compose([function (x) { return 10 * x; }, function (x) { return 10 * x; }, function (x) { return 10 * x; }]);
console.log("Final 2: " + fn2(1));
var fn3 = compose([]);
console.log("Final 3: " + fn3(42));
//# sourceMappingURL=main.js.map