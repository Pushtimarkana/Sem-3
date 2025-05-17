const mongoose = require("mongoose");
const schema = mongoose.Schema({
  Enroll:Number,
  FirstName:String,
  LastName:String,
  age:Number
  // Firstname: {
  //   type: String,
  //   require: true,
  // },
  // Lastname: {
  //   type: String,
  // },
  // Email: {
  //   type: Number,
  //   require: true,
  // },
  // Age: {
  //   type: Number,
  // },
});
module.exports = mongoose.model("student", schema);