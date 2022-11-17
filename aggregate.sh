# insert following code into db
[{name:'abc',score:53,grade:'F'},{name:'def',score:73,grade:'A'},{name:'ghi',score:88,grade:'B'},{name:'jkl',score:91,grade:'F'}]

# sum
db.col.aggregate([{ $group: { _id:"1", total: { $sum: "$score" } }  }])
# addtoset
db.col.aggregate([{ $group: { _id:"1", grade: { $addToSet: "$grade" } }  }])
# max
db.col.aggregate([{ $group: { _id:"1", max: { $max: "$score" } }  }])
# min
db.col.aggregate([{ $group: { _id:"1", min: { $min: "$score" } }  }])
# average
db.col.aggregate([{ $group: { _id:"1", avg: { $avg: "$score" } }  }])
# first
db.col.aggregate([{ $group: { _id:"1", first: { $first: "$name" } }  }])
# last
db.col.aggregate([{ $group: { _id:"1", last: { $first: "$name" } }  }])
# push
db.col.aggregate([{ $group: { _id:"1", students: { $push: "$name" } }  }])
# total
db.col.aggregate([{ $group: { _id:"1", count: { $sum: 1 } }  }])
