//lab8

const file1=require('./Hellow.js');

console.log(file1.disarea(10));

//path ni join method it is joint two paths
const path=require('path');
console.log(path.join('/abc','/xyz'));

//path normalize mothod 
const ans=path.normalize('/abc/../xyz/../arjun');
console.log("normalize:"+ans);

//path resolve method--it convert relative path tp absolute path
const ans2=path.resolve('././arjun');
console.log("resolve:"+ans2);

//path relative method it return relative path
const ans3=path.relative('/abc/Hellow.js','/abc/xyz/Hellow2.js');
console.log("relative:"+ans3);