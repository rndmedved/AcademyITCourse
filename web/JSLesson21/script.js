const images = document.querySelectorAll('.gallery img');
let currentImageIndex = 0;
const prevBtn = document.querySelector('.prev');
const nextBtn = document.querySelector('.next');
function changeImage(){
    images[currentImageIndex].classList.remove('active');
    currentImageIndex = (currentImageIndex === images.length - 1)? 0:currentImageIndex+1;
    images[currentImageIndex].classList.add('active');
}
//Смена фотографии каждые 5 минут
setInterval(changeImage, 5000);
//Смена фотографии по кнопкам вперед и назад
// prevBtn.addEventListener('click',()=>{
//     images[currentImageIndex].classList.remove('active');
//     currentImageIndex = (currentImageIndex === 0)?images.length-1:currentImageIndex-1;
//     images[currentImageIndex].classList.add('active');
// });
// nextBtn.addEventListener('click',()=>{
//     changeImage();
// });
   