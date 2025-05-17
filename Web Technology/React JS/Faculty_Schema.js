const mongoose =require('mongoose');
const schema=mongoose.Schema({
    FirstName:String,
    LastName:String,
    Age:Number,
    Dept:String
});
module.exports=mongoose.model("Faculty_Schema",schema,"faculty")