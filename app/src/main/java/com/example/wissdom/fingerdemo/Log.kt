package com.example.wissdom.fingerdemo

import android.content.Context
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ImageSpan
import android.util.Log
import android.widget.TextView
import android.widget.Toast

/**
 *
 * @author：Coco
 * date：2019/7/12
 * version：1.0
 * description:Log
 */
class Log {
    companion object {
        val KEY = "LOG--->"
        fun log(log: String) {
            Log.e(KEY, log)
        }
    }
    /**
     * 将目标String的替换为Image
     *
     * @param mainBody
     * @param targetBody
     * @param drawableRes
     * @return
     */
    fun TextView.setTextWithImageSpan(mainBody: String?, targetBody: String?, drawableRes: Int) {
        if (mainBody.isNullOrEmpty() || targetBody.isNullOrEmpty() || drawableRes <= 0) {
            return
        }
        val spannableStr = SpannableString(mainBody)
        val start = mainBody!!.indexOf(targetBody!!)
        val end = start!! + targetBody!!.length
        spannableStr.setSpan(ImageSpan(context, drawableRes), start, end, Spanned.SPAN_EXCLUSIVE_INCLUSIVE)
        text = spannableStr
    }

        fun Context.ShowToast(toastMsg: String): Toast {
            var toast = Toast.makeText(this, toastMsg, Toast.LENGTH_SHORT)
            toast.show()
            return toast
        }

}