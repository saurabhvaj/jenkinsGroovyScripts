Hudson.instance.allItems.each { job ->
  //println job.fullName
  flag = 1 
  Jenkins.instance.views.each { view ->
   if (view.name != "all"){  
    view.items.each { item ->

        if (item.name == job.fullName) {
           //println "\t- ${job.fullName} - ${view.name}"
           flag = 0
        } 
     }
    
  } 
 } 
  if (flag == 1){
    println "JobName Without View: \t- ${job.fullName}"

  }
}
