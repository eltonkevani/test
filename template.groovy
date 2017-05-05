xlr {
  release('testTemplate ${XLD_BRANCH}') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-05-04T09:00:00+0200')
    scriptUsername 'admin'
    scriptUserPassword '{b64}YFKOzMTEICsqFJ592l2FbQ=='
    phases {
      phase('Phase 1') {
        color '#009CDB'
        tasks {
          manual('bla') {
            
          }
        }
      }
      phase('New Phase') {
        tasks {
          custom('script') {
            script {
              type 'remoteScript.Unix'
              script 'echo lalala'
              remotePath '/home/elton/tmp'
              temporaryDirectoryPath '/home/elton/tmp'
              address '192.168.0.50'
              username 'elton'
              password '{b64}OfgIffERzGxh1qLyySz73Q=='
            }
          }
        }
      }
    }
  }
}
