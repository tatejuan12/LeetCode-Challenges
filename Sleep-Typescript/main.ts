async function main() {
  let t = Date.now();
  console.log(Date.now() - t);
  await sleep(200);
  console.log(Date.now() - t);
}

async function sleep(millis: number): Promise<void> {
  return new Promise((resolve) => {
    setTimeout(resolve, millis);
  });
}

main();
