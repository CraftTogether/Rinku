[![](https://img.shields.io/badge/Discord-7289DA?style=for-the-badge&logo=discord&logoColor=white)](https://discord.gg/zSWjKVvfNy)
[![](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/CraftTogether) <BR>
[![](https://jitpack.io/v/CraftTogether/Rinku.svg)](https://jitpack.io/#CraftTogether/Rinku)
![](https://img.shields.io/badge/Maintained%3F-yes-green.svg) <BR>
[![](https://img.shields.io/github/downloads/CraftTogether/rinku/total.svg)](https://github.com/CraftTogether/rinku/releases)
![](https://img.shields.io/github/issues/CraftTogether/rinku.svg)
![](https://img.shields.io/github/issues-pr/CraftTogether/rinku.svg)
# ⛓ Rinku

Plugin to connect your Minecraft Account with Discord.

💬 **Discord commands**  
Get a code via direct messages to connect the Discord account to Minecraft.
```
/link
```
Unlink your connection.
```
/unlink
```

⛏ **Minecraft commands**  
Verify the code you got from `/link`
```
/verify
```

## Download
To download Rinku go to [releases](https://github.com/CraftTogether/Rinku/releases)

## Developers
replace `VERSION` with the latest version (see the badges at top of repo)
### Gradle:
```gradle
repositories {
    maven {
        url: 'https://jitpack.io'
    }
}

dependencies {
    compileOnly 'com.github.CraftTogether:rinku:VERSION`
}
```
### Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.CraftTogether</groupId>
        <artifactId>rinku</artifactId>
        <version>VERSION</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```