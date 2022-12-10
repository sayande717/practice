const counterValue = document.getElementById('counter')
let counter = 0

document.getElementById('incrementButton').addEventListener('click',function () {
    ++counter
    counterValue.innerText = counter
})

document.getElementById('decrementButton').addEventListener('click', function (){
    --counter
    counterValue.innerText = counter
})