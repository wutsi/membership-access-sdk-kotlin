package com.wutsi.membership.dto

import kotlin.String

public data class UpdateAccountAttributeRequest(
  public val name: String = "",
  public val `value`: String? = null,
)
