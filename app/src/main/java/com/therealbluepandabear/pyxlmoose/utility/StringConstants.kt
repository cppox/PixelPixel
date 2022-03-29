package com.therealbluepandabear.pyxlmoose.utility

/**
 * In the future, I will remove this to support different languages inside the app.
 *
 * Though for now, I will leave this file until I decide on adding support for more languages.
 */

object StringConstants {
    const val AppName = "PyxlMoose"

    const val TabStarredTitle = "Starred"

    const val ProjectTitleExtra = "ProjectTitleExtra"
    const val WidthExtra = "WidthExtra"
    const val HeightExtra = "HeightExtra"
    const val IndexExtra = "IndexExtra"

    const val DialogPositiveButtonText = "OK"
    const val DialogNegativeButtonText = "Cancel"
    const val DialogExceptionInfoTitle = "Exception Info"
    const val DialogViewFileErrorTitle = "Error trying to view file"
    const val DialogClearCanvasTitle = "Clear canvas"
    const val DialogClearCanvasMessage = "Are you sure you want to clear the canvas?"
    const val DialogUnsavedChangesTitle = "Unsaved changes"
    const val DialogUnsavedChangesMessage = "You have unsaved changes, are you sure you want to exit?"

    const val SnackbarViewExceptionInfoButtonText = "View"
    const val SnackbarCannotDeletePrimaryColorPaletteText = "Cannot delete default color palette"
    const val SnackbarFindAndReplaceWarning = "You must have at least one color on your canvas to use this tool"

    const val FragmentFindAndReplaceTitle = "Find and Replace"
    const val FragmentColorPickerTitle = "Select Color"
    const val FragmentNewColorPaletteTitle = "New Color Palette"
    const val FragmentSprayToolSettingsTitle = "Spray Tool Settings"

    const val ColorFilterIdentifier = "ColorFilter"
    const val DarkenFilterIdentifier = "DarkenFilter"
    const val LightenFilterIdentifier = "LightenFilter"
    const val InvertFilterIdentifier = "InvertFilter"
    const val GrayscaleFilterIdentifier = "GrayscaleFilter"

    const val PencilToolIdentifier = "PencilTool"
    const val FillToolIdentifier = "FillTool"
    const val VerticalMirrorToolIdentifier = "VerticalMirrorTool"
    const val HorizontalMirrorToolIdentifier = "HorizontalMirrorTool"
    const val LineToolIdentifier = "LineTool"
    const val RectangleToolIdentifier = "RectangleTool"
    const val OutlinedRectangleToolIdentifier = "OutlinedRectangleTool"
    const val SquareToolIdentifier = "SquareTool"
    const val OutlinedSquareToolIdentifier = "OutlinedSquareTool"
    const val CircleToolIdentifier = "CircleTool"
    const val OutlinedCircleToolIdentifier = "OutlinedCircleTool"
    const val SprayToolIdentifier = "SprayTool"
    const val PolygonToolIdentifier = "PolygonTool"
    const val DitherToolIdentifier = "DitherTool"
    const val DarkenToolIdentifier = "DarkenTool"
    const val LightenToolIdentifier = "LightenTool"
    const val ClearCanvasToolIdentifier = "ClearCanvasTool"
    const val ColorPickerToolIdentifier = "ColorPickerTool"
    const val FindAndReplaceToolIdentifier = "FindAndReplaceTool"
    const val EraseToolIdentifier = "EraseTool"
    const val GridToolIdentifier = "GridTool"

    const val SharedPreferencePixelPerfectIdentifier = "PixelPerfectSharedPreference"
    const val SharedPreferencesSprayRadiusIdentifier = "SprayRadiusSharedPreference"
    const val SharedPreferencesSprayStrengthIdentifier = "SprayStrengthSharedPreference"

    const val ExceptionInvalidWidthHeightMessage = "Invalid width/height value"
    const val ExceptionInvalidRadiusStrengthMessage = "Invalid radius/strength"
    const val ExceptionAccessingNegativeIndex = "Cannot access pixel art object with a negative index in list!"

    const val prevOrientationBundleIdentifier = "PrevOrientation"
    const val prevBitmapStrBundleIdentifier = "PrevBitmapStr"

    const val DefaultToolbarItemColor = "#0099cc"
    const val PixelGridViewCheckerboardColor = "#d9d9d9"
    const val SnackbarBackgroundColor = "#eaddff"
}