function createCounter(n: number): () => number {
  return function () {
    return n++;
  };
}

const counter = createCounter(8);
console.log(counter()); // 10
console.log(counter()); // 11
console.log(counter()); // 12
