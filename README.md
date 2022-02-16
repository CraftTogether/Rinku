[![](https://img.shields.io/badge/Discord-7289DA?style=for-the-badge&logo=discord&logoColor=white)](https://discord.gg/zSWjKVvfNy)
[![](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/CraftTogether) <BR>
[![](https://img.shields.io/github/v/release/CraftTogether/Rinku?color=brightgreen&label=Plugin%20version)](https://github.com/CraftTogether/Rinku/releases)
[![](https://img.shields.io/github/v/tag/CraftTogether/Rinku?color=brightgreen&label=API%20version)](https://repo.polarian.dev/repo/xyz/crafttogether/Rinku/)
![](https://img.shields.io/badge/Maintained%3F-no-red.svg) <BR>
[![](https://img.shields.io/github/downloads/CraftTogether/rinku/total.svg)](https://github.com/CraftTogether/rinku/releases)
![](https://img.shields.io/github/issues/CraftTogether/rinku.svg)
![](https://img.shields.io/github/issues-pr/CraftTogether/rinku.svg)
![](https://img.shields.io/github/repo-size/CraftTogether/Rinku)
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
        url: 'https://repo.polarian.dev/repo'
    }
}
```

```gradle
dependencies {
    compileOnly 'xyz.crafttogether:Rinku:VERSION`
}
```
### Maven:
```xml
<repositories>
    <repository>
        <id>polarian-repo</id>
        <url>https://repo.polarian.dev/repo</url>
    </repository>
</repositories>
```

```xml
<dependencies>
    <dependency>
        <groupId>xyz.crafttogether</groupId>
        <artifactId>Rinku</artifactId>
        <version>VERSION</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
