(ns slackingbird.config)

(defn bot-token []
  (System/getenv "SB_TELEGRAM_BOT_TOKEN"))

(defn base-url []
  (System/getenv "SB_BASE_URL"))

(defn proxy-host []
  (System/getenv "SB_PROXY_HOST"))

(defn proxy-port []
  (System/getenv "SB_PROXY_PORT"))

(defn proxy-user []
  (System/getenv "SB_PROXY_USER"))

(defn proxy-pass []
  (System/getenv "SB_PROXY_PASS"))