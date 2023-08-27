//Incrementing counter by 1
const counter1Value = document.getElementById('counter')
let count = 0
document.getElementById('incrementButtonBy1').addEventListener('click', function() {
    ++count
    counter1Value.innerText = count
})
document.getElementById('decrementButtonBy1').addEventListener('click',function() {
    --count
    counter1Value.innerText = count
})

//Incrementing counter by 2
const counter2Value = document.getElementById('counter')
document.getElementById('incrementButtonBy2').addEventListener('click',function() {
    count+=2
    counter2Value.innerText = count
})
document.getElementById('decrementButtonBy2').addEventListener('click',function() {
    count-=2
    counter2Value.innerText = count
})