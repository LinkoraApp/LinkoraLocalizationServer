package saketh.linkora.localization.domain

import saketh.linkora.localization.domain.model.info.AvailableLanguageDTO

enum class Language(val availableLanguageDTO: AvailableLanguageDTO) {
    HINDI(
        AvailableLanguageDTO(
            localizedName = "हिंदी", languageCode = "hi"
        )
    )
}