package model.employment

data class Employee(
    val name: String,
    var profession: String = "Software Engineer",
    var employer: Company = NETLIGHT
)