"use strict";

function findNaughtyStep (original, modified)
{
    let firstStepChanged = "";
    let bigger = original;
    let smaller = modified;

    if (original.length < modified.length)
    {
        bigger = modified;
        smaller = original;
    }

    for (let i = 0; i < smaller.length && firstStepChanged == ""; i++)
    {
        if (bigger.charAt(i) != smaller.charAt(i))
        {
            firstStepChanged = bigger.charAt(i);
        }
    }

    if (bigger.length > smaller.length && firstStepChanged == "")
    {
        firstStepChanged = bigger.charAt(bigger.length - 1);
    }

    return firstStepChanged || "";
}

function findNaughtyStepV2 (original, modified)
{
    let bigger = original.length < modified.length 
        ? modified 
        : original;
    let smaller = original.length < modified.length 
        ? original 
        : modified;

    return [...bigger]
        .find((step, index) => 
        step !== smaller.charAt(index)) 
        || "";
}

let original = 'abcd';
let modified = 'abcde';
console.log(findNaughtyStep(original, modified)); // 'e'
console.log(findNaughtyStepV2(original, modified)); // 'e'

original = 'stepfor';
modified = 'stepor';
console.log(findNaughtyStep(original, modified)); // 'f'
console.log(findNaughtyStepV2(original, modified)); // 'f'

original = 'abcde';
modified = 'abcde';
console.log(findNaughtyStep(original, modified)); // ''
console.log(findNaughtyStepV2(original, modified)); // ''

original = 'xxxx';
modified = 'xxoxx';
console.log(findNaughtyStep(original, modified)); // 'o'
console.log(findNaughtyStepV2(original, modified)); // 'o'