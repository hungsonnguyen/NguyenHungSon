function Fibonacci(n) {
    if (n < 2) {
        return 1;
    }
    else {
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    return Fibonacci(n - 1);
}
let array = [];
let total = 0;
let n = 10;
for (let i = 0; i < n; i++) {
    array.push(Fibonacci(i));
    total += Fibonacci(i);
}
for (let index in array) {
    console.log(array[index]);
}
console.log(array);
console.log("Total of array fibonacci is:" + total);
//# sourceMappingURL=main.js.map