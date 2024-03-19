function checkIfInstanceOf(obj, classFunction) {
    // if (obj instanceof classFunction) return true;
    // if (obj.constructor === classFunction) return true;
    if (classFunction === null ||
        classFunction === undefined ||
        typeof classFunction !== "function")
        return false;
    if (Object(obj) instanceof classFunction)
        return true;
    return false;
}
console.log(checkIfInstanceOf(new Date(), Date)); // true
console.log((() => {
    class Animal {
    }
    class Dog extends Animal {
    }
    return checkIfInstanceOf(new Dog(), Animal);
})());
console.log((() => checkIfInstanceOf(Date, Date))());
console.log((() => checkIfInstanceOf(5, Number))());
console.log((() => checkIfInstanceOf(5n, Object))());
//# sourceMappingURL=main.js.map