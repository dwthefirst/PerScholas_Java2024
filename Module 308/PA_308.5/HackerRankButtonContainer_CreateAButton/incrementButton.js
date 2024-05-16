let btn = document.getElementById('btn');

let timesClicked = 0;
btn.addEventListener('click', function() {
    timesClicked++;
    btn.innerHTML = timesClicked;
})