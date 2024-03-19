class ArrayWrapper {
  numbers: number[];
  constructor(nums: number[]) {
    this.numbers = nums;
  }
  valueOf(obj3: ArrayWrapper, obj4: ArrayWrapper): number {
    if (this.numbers.length == 0) return 0;
    return this.numbers.reduce((prev, curr) => prev + curr);
    // return this._nums.reduce((sum,n) => sum+n, 0)
  }
  toString(): string {
    return "[" + this.numbers.toString() + "]";
  }
}

const obj1 = new ArrayWrapper([1, 2]);
const obj2 = new ArrayWrapper([4, 3]);
console.log(obj1 + obj2); // 10
String(obj1); // "[1,2]"
String(obj2); // "[3,4]"
