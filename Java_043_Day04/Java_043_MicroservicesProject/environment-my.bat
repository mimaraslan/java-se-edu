@echo off
setx AUTH_SERVER_PORT "9090"

setx AUTH_DB_PROTOCOL "postgresql"
setx AUTH_DB_IP "127.0.0.1"
setx AUTH_DB_PORT "5432"
setx AUTH_DB_NAME "Micro_AuthServiceDB"
setx AUTH_DB_DRIVER "org.postgresql.Driver"

setx AUTH_DB_USERNAME "postgres"
setx AUTH_DB_PASSWORD "123456789"
setx AUTH_SECRET_KEY "Istanbul34"
setx AUTH_ISSUER "Ankara06"


setx GITHUB_CONFIG_PATH_PROJECT "https://github.com/mimaraslan/config-server-remote-repo.git"
setx GITHUB_USERNAME "mimaraslan"
setx GITHUB_TOKEN_KEY "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"