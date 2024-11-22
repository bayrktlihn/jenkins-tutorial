# Plugins
- Pipeline: Stage View
- GitHub
- Maven Integration
- Config File Provider
- Role-based Authorization StrategyVersion
- Publish Over SSH

# Important Environments
- BUILD_ID
- BUILD_NUMBER
- JOB_NAME
- STAGE_NAME
- WORKSPACE
- BRANCH_NAME
- NODE_NAME
- NODE_LABELS

# Command Examples
- git url: "https://github.com/bayrktlihn/jenkins-tutorial.git", branch: "main"
- sh 'set'
- sh 'ssh -p por_number user@sunucu_ip_adresi'
- withCredentials([usernamePassword(credentialsId: 'your_credentials_id', usernameVariable: 'your_username_variable_name', passwordVariable: 'your_password_variable_name')]){ your_codes }


