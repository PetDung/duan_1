let sizeLabels = document.querySelectorAll(".sizeLabel");
sizeLabels.forEach(item=>{
    let sizeName = item.getAttribute("for");
    console.log(sizeName);
})