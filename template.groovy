def rel = getCurrentRelease()
def variable1 = rel.variables['variable1'].value?

xlr {
  release('test') {
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
