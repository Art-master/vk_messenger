package com.app.tigr.domain.message

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class CurrentKeyboard(

	@field:SerializedName("buttons")
	val buttons: List<List<ButtonsItemItem?>?>? = null,

	@field:SerializedName("one_time")
	val oneTime: Boolean? = null,

	@field:SerializedName("author_id")
	val authorId: Int? = null
)