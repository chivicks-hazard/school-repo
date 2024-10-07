const container = document.querySelector(".container");
const color1 = document.querySelector(".color-1");
const color2 = document.querySelector(".color-2");
const shoeOne = document.querySelector(".shoe-1");
const shoeTwo = document.querySelector(".shoe-2");
const shoePriceTag = document.querySelectorAll(".price span")[1];
const sizeBtns = document.querySelectorAll(".sizes span");
const shoeSizes = [
  {
    "7": 24,
    "8": 27,
    "9": 30,
    "10": 33,
    "11": 36
  },
  {
    "7": 27,
    "8": 30,
    "9": 33,
    "10": 36,
    "11": 39
  }
];

const shoePrices = {
    "7": 150,
    "8": 250,
    "9": 350,
    "10": 450,
    "11": 550
};

color2.addEventListener("click", () => {
  container.classList.add("change");
});

color1.addEventListener("click", () => {
  container.classList.remove("change");
});

sizeBtns.forEach((sizeBtn) => {
  sizeBtn.addEventListener("click", (e) => {
    for (let i = 0; i < sizeBtns.length; i++) {
      sizeBtns[i].classList.remove("active");
    }
    e.target.classList.add("active");

    shoeOne.style.width = `${shoeSizes[0][e.target.textContent]}rem`;
    shoeTwo.style.width = `${shoeSizes[1][e.target.textContent]}rem`;

    shoePriceTag.textContent = `$${shoePrices[e.target.textContent]}.00`;
  })
})