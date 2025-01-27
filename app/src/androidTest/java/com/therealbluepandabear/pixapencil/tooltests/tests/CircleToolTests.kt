/*
 * PixaPencil
 * Copyright 2022  therealbluepandabear
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.therealbluepandabear.pixapencil.tooltests.tests

import android.graphics.Color
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.therealbluepandabear.pixapencil.activities.canvas.CanvasActivity
import com.therealbluepandabear.pixapencil.algorithms.CircleAlgorithm
import com.therealbluepandabear.pixapencil.extensions.getPixel
import com.therealbluepandabear.pixapencil.models.Coordinates
import com.therealbluepandabear.pixapencil.tooltests.helper.ToolTestsHelper
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class CircleToolTests {
    @get:Rule
    val activityRule = ActivityScenarioRule(CanvasActivity::class.java)

    @Test
    fun ctt_1() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val circleAlgorithm = CircleAlgorithm(it.primaryAlgorithmInfoParameter)
            circleAlgorithm.compute(Coordinates(0, 0), Coordinates(2, 2))

            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 2)) == Color.BLACK)
        }
    }

    @Test
    fun ctt_2() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val circleAlgorithm = CircleAlgorithm(it.primaryAlgorithmInfoParameter)
            circleAlgorithm.compute(Coordinates(0, 0), Coordinates(3, 3))

            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 2)) == Color.BLACK)
        }
    }

    @Test
    fun ctt_3() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val circleAlgorithm = CircleAlgorithm(it.primaryAlgorithmInfoParameter)
            circleAlgorithm.compute(Coordinates(0, 0), Coordinates(4, 4))

            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 4)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 4)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 4)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(4, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(4, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(4, 3)) == Color.BLACK)
        }
    }

    @Test
    fun ctt_4() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val circleAlgorithm = CircleAlgorithm(it.primaryAlgorithmInfoParameter)
            circleAlgorithm.compute(Coordinates(0, 0), Coordinates(5, 5))

            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(4, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 4)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 5)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 5)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 5)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(4, 5)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 4)) == Color.BLACK)
        }
    }

    @Test
    fun ctt_5() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val circleAlgorithm = CircleAlgorithm(it.primaryAlgorithmInfoParameter)
            circleAlgorithm.compute(Coordinates(0, 0), Coordinates(6, 6))

            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(4, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 4)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(6, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(6, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(6, 4)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 6)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 6)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(4, 6)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 5)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 5)) == Color.BLACK)
        }
    }

    @Test
    fun ctt_6() {
        activityRule.scenario.onActivity {
            ToolTestsHelper.prepare(it)

            val circleAlgorithm = CircleAlgorithm(it.primaryAlgorithmInfoParameter)
            circleAlgorithm.compute(Coordinates(0, 0), Coordinates(49, 49))

            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(25, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 24)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(25, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 25)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(24, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 24)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 25)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(24, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(26, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 23)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(26, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 26)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(23, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 23)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 26)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(23, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(27, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 22)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(27, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 27)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(22, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 22)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 27)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(22, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(28, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 21)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(28, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 28)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(21, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 21)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 28)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(21, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(29, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 20)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(29, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(49, 29)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(20, 0)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 20)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(0, 29)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(20, 49)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(30, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(48, 19)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(30, 48)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(48, 30)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(19, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 19)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 30)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(19, 48)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(31, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(48, 18)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(31, 48)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(48, 31)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(18, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 18)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 31)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(18, 48)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(32, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(48, 17)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(32, 48)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(48, 32)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(17, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 17)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 32)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(17, 48)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(33, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(48, 16)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(33, 48)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(48, 33)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(16, 1)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 16)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(1, 33)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(16, 48)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(34, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(47, 15)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(34, 47)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(47, 34)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(15, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 15)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 34)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(15, 47)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(35, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(47, 14)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(35, 47)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(47, 35)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(14, 2)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 14)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(2, 35)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(14, 47)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(36, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(46, 13)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(36, 46)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(46, 36)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(13, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 13)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 36)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(13, 46)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(37, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(46, 12)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(37, 46)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(46, 37)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(12, 3)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 12)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(3, 37)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(12, 46)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(38, 4)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(45, 11)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(38, 45)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(45, 38)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(11, 4)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(4, 11)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(4, 38)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(11, 45)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(39, 5)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(44, 10)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(39, 44)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(44, 39)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(10, 5)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 10)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 39)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(10, 44)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(40, 5)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(44, 9)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(40, 44)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(44, 40)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(9, 5)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 9)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(5, 40)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(9, 44)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(41, 6)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(43, 8)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(41, 43)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(43, 41)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(8, 6)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(6, 8)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(6, 41)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(8, 43)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(42, 7)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(42, 7)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(42, 42)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(42, 42)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(7, 7)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(7, 7)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(7, 42)) == Color.BLACK)
            assert(it.binding.activityCanvasDrawingView.drawingViewBitmap.getPixel(Coordinates(7, 42)) == Color.BLACK)
        }
    }
}