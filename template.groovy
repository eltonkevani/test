xlr {
  release('test') {
    variables {
      stringVariable('variable1') {
        value 'lalala'
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-05-08T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('manual ${variable1}') {
            
          }
        }
      }
    }
  }
}
