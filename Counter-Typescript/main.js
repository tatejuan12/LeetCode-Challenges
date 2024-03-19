function createCounter(n) {
    return function () {
        return n++;
    };
}
var counter = createCounter(8);
console.log(counter()); // 10
console.log(counter()); // 11
console.log(counter()); // 12
//# sourceMappingURL=main.js.map