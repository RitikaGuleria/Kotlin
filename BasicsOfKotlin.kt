//codelabs
fun main() 
{
    //practice problems 
    val firstNumber = 10
    val secondNumber = 5
    val result=firstNumber+secondNumber
    println("Result is: $result")
    
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
    
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary(additional bonus).")
    
    var discountPercentage: Int 
    var offer: String
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
    
    val Steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories") 
    
    //function calls
    println(task1())
    println(partyInvitation())
    println(friend("Abhishek",45765))
    println(screenTime(300,400));
    println(weather("Ankara","27","31","82%"))
    println(weather("Tokyo","32","36","10%"))
    println(weather("Cape Town", "59", "64", "2%"))
    print(weather("Guatemala City", "50","55", "7%"))
   
}
//Can you write a main() function that prints these messages on four separate lines?
fun task1():Unit
{
    println(println("Use the val keyword when the value doesn't change.\nUse the var keyword when the value can change.\nWhen you define a function, you define the parameters that can be passed to it.\nWhen you call a function, you pass arguments for the parameters."))
}
fun partyInvitation():String
{
    val a1="Hi Ritika"
    val a2="I'm inviting you for a party"
    return "$a1\n$a2"
}
fun friend(name:String,phoneNumber:Int,address:String="Muzaffarnagar"):String
{
    val a="Dialing $phoneNumber, Hi! $name\nAre you from $address"
    val b="Can I take your 5 minutes to talk?"
    return "$a\n$b"
}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double 
{
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}

fun screenTime(timeSpentTodayInMinutes:Int, timeSpentYesterdayInMinutes:Int):Boolean
{
    if(timeSpentTodayInMinutes>timeSpentYesterdayInMinutes)
    {
        return true;
    }
    else
    {
        return false;
    }
}

fun weather(city:String,lowTemp:String,highTemp:String,chanceOfRain:String):String
{
    val a="City: $city"
    val b="Low Temperature: $lowTemp"
    val c="High Temperature: $highTemp"
    val d="Chance of Rain: $chanceOfRain"
    return "$a\n$b\n$c\n$d"
}