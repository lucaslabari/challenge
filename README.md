# android-interview

## Overview

Our Android SDK allows users to capture logs. To ensure the payload does not get too large, we want to limit the number of logs that are captured. 
To achieve this we want to implement these limits:
- Count: Log no more than n logs.
- Rate: Log no more than n logs every m seconds.
