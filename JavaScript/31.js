let counter = 0
//Get the button by ID

const ulElement = document.getElementById("list-items")
let counterElement = document.getElementById('counter')
const getButtonIncrement = document.querySelector('#increment')
const getButtonDecrement = document.getElementById('decrement')

getButtonIncrement.addEventListener('click', function () {
    counterElement.innerText = ++counter    
    const listItem = document.createElement('li')
    listItem.innerText = 'Counter: '+counter
    listItem.setAttribute('data-counter',counter)
    ulElement.appendChild(listItem)
})

getButtonDecrement.addEventListener('click', function () {
    // Syntax: '[data-counter="'+data-item+'"]'
    const rmListItem = ulElement.querySelector('[data-counter="' + counter + '"]')
    rmListItem.remove()
    counterElement.innerText = --counter
})

document.getElementById('removeEven').addEventListener('click', function ()
{
    const li = ulElement.querySelector('[data-counter="' + counter + '"]')
    const number = parseInt(li.getAttribute('data-counter'), 10)
    if (number % 2 === 0)
    {
        li.remove()
    }
    counterElement.innerText = --counter
})
