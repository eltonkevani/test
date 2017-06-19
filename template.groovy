def variable1 = releaseVariables['variable1']

xlr {
  release('Release 'variable1) {
    variables {
      stringVariable('variable1') {
        value variable1
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
