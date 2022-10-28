package com.wutsi.membership

import kotlin.String

public enum class Environment(
  public val url: String,
) {
  SANDBOX("https://membership-access-server-test.herokuapp.com"),
  PRODUCTION("https://membership-access-server-prod.herokuapp.com"),
  ;
}
