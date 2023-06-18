package demo.demo_02_data_classes

import model.Company
import model.NETLIGHT

data class DemoDataClassesSolved(
    val name: String,
    var profession: String = "Consultant",
    var employer: Company = NETLIGHT
)