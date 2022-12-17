let counter = 0
const counterValue = document.getElementById('counterValue')
const ulElement = document.getElementById('counterList')

function setColor(value) {
    if (value % 2 === 0) {
        return 'red'
    }
    else {
        return 'yellow'
    }
}

document.getElementById('incrementBy1').addEventListener('click', function () {
    const li = document.createElement('li')
    ++counter
    counterValue.innerText = counter
    li.innerHTML = '<strong>Counter</strong>: '+counter
    // Setting CSS Styles
    li.style.background = setColor(counter)
    li.style.paddingTop = '10px'
    li.style.paddingBottom = '10px'
    ulElement.appendChild(li)
})

document.getElementById('decrementBy1').addEventListener('click', function ()
{
    const li = document.createElement('li')
    --counter
    counterValue.innerText = counter
    li.innerHTML = '<strong>Counter</strong>: ' + counter
    li.style.background = setColor(counter)
    ulElement.appendChild(li)
})