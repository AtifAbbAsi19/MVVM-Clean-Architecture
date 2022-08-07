package com.inc.clean_architecturemvvm.utils

import androidx.annotation.RawRes
import com.inc.clean_architecturemvvm.ui.core.BaseApplication

class AppUtils {


    //method will return string data from file placed in raw folder
    private fun getJSONFile(@RawRes fileId: Int) =
        BaseApplication().getContext()?.resources?.getRawTextFile(fileId)

}