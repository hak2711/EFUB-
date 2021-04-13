const newArr = new Array(1,2,3,4,5);

let sum = 0;

for(let i = 1; i<=10; i++){
    sum+=i;
}
//console.log(sum);

for(let number of newArr){
    sum+=number;
} 
//console.log(sum);

const order = {
    orderNum: 20210401,
    orderId: "efubFront",
    name: "이펍",
    address: "서울특별시 서대문구 이화여대길 52"
};

for(let key in order){
    console.log(`${key}: ${order[key]}`);
}

const array = [1,2,3,4,5];
const arrayThreetimes = array.map(num => num*3);

arrayThreetimes.forEach(number => {
    if(number % 2 == 0) console.log(number);
})