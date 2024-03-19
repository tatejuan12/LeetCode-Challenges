function reduce(nums, fn, init) {
    var target = init;
    nums.forEach(function (num) {
        target = fn(target, num);
    });
    return target;
}
console.log(reduce([], function sum(accum, curr) {
    return 0;
}, 25));
//# sourceMappingURL=main.js.map