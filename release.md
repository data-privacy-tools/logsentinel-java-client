To make a release:

- optionally regenerate using `java -jar swagger-codegen-cli-2.3.1.jar generate -i http://localhost:8080/api-docs/def -l java -o /workspace/logsentinel-java-client --invoker-package com.logsentinel --model-package com.logsentinel.model --api-package com.logsentinel.api --http-user-agent LogSentinel-Java-Client --group-id com.logsentinel --artifact-id logsentinel-java-client --config swagger-codegen.json`

- change the current SNAPSHOT version to a non-snapshot one (remove -SNAPSHOT)
- run `mvn clean deploy -Dgpg.passphrase=<..>`

(you need the proper gpg keys for the OSS account setup) 