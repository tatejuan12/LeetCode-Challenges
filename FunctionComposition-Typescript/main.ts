type F = (x: number) => number;

function compose(functions: F[]): F {
  let target: number = 0;
  return function (x) {
    if (functions.length == 0) return x;
    target += functions.pop()(x);
    target = compose(functions)(target);
    return target;
  };
}

const fn = compose([(x) => x + 1, (x) => x * x, (x) => 2 * x]);
console.log("Final 1: " + fn(4));
const fn2 = compose([(x) => 10 * x, (x) => 10 * x, (x) => 10 * x]);
console.log("Final 2: " + fn2(1));
const fn3 = compose([]);
console.log("Final 3: " + fn3(42));
