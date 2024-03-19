type Fn = (accum: number, curr: number) => number;

function reduce(nums: number[], fn: Fn, init: number): number {
  var target: number = init;
  nums.forEach((num) => {
    target = fn(target, num);
  });
  return target;
}

console.log(
  reduce(
    [],
    function sum(accum, curr) {
      return 0;
    },
    25
  )
);
