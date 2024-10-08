package com.jeonghun.portfolio.domain

import com.jeonghun.portfolio.domain.constant.SkillType
import com.jeonghun.portfolio.domain.entity.*
import com.jeonghun.portfolio.domain.repository.*
import jakarta.annotation.PostConstruct
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.time.LocalDate

@Component
@Profile(value=["default"])
class DataInitializer(
    private val achievementRepository: AchievementRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val projectRepository: ProjectRepository,
    private val experienceRepository: ExperienceRepository,
    private val skillRepository: SkillRepository)
{
    @PostConstruct
    fun initializeData() {

        println("Spring has been started. Reset the Test Data")

        val achievements = mutableListOf<Achievement>(
            Achievement(
                title="2022 CatKao Best Award",
                description = "Hello",
                host="KatKao",
                achievedDate = LocalDate.of(2024,10,8),
                isActive = true
            ),
            Achievement(
                title="2022 CatKao Best Award",
                description = "Hello",
                host="KatKao",
                achievedDate = LocalDate.of(2002,6,11),
                isActive = true
            )
        )
        achievementRepository.saveAll(achievements)

        val introductions = mutableListOf<Introduction>(
            Introduction(content="Find the Problem & Solutions.", isActive = true),
            Introduction(content="Try hard on everything I can", isActive = true),
            Introduction(content="I like to sleep", isActive = true)
        )
        introductionRepository.saveAll(introductions)

        val links = mutableListOf<Link>(
            Link(name="Github", content = "https://www.youtube.com/watch?v=6ZkQ4IeN-Vs&t=11759s", isActive=true)
        )
        linkRepository.saveAll(links)

        val experience1 = Experience(
            title ="Catholic Univ.",
            description = "Computer Science",
            startYear = 2021,
            startMonth = 3,
            endYear = 2024,
            endMonth = 5,
            isActive = true
        )
        experience1.addDetails(
            mutableListOf(
                ExperienceDetail(content="GPA 4.3/4.5", isActive=true),
                ExperienceDetail(content="Software Study", isActive=true)
            )
        )
        val experience2 = Experience(
            title ="Catholic Univ.",
            description = "Computer Science",
            startYear = 2021,
            startMonth = 3,
            endYear = null,
            endMonth = null,
            isActive = true
        )
        experience2.addDetails(
            mutableListOf(
                ExperienceDetail(content="Cat says Meow", isActive=true),
                ExperienceDetail(content="Dog says Woof", isActive=true)
            )
        )
        experienceRepository.saveAll(mutableListOf(experience1, experience2))

        val java = Skill(name="Java", type= SkillType.LANGUAGE.name, isActive=true)
        val kotlin = Skill(name="kotlin", type= SkillType.LANGUAGE.name, isActive=true)
        val python = Skill(name="python", type= SkillType.LANGUAGE.name, isActive=true)
        val spring = Skill(name="spring", type= SkillType.LANGUAGE.name, isActive=true)
        val django = Skill(name="django", type= SkillType.LANGUAGE.name, isActive=true)
        val mysql = Skill(name="mysql", type= SkillType.LANGUAGE.name, isActive=true)
        val redis = Skill(name="redis", type= SkillType.LANGUAGE.name, isActive=true)
        val kafka = Skill(name="kafka", type= SkillType.LANGUAGE.name, isActive=true)
        skillRepository.saveAll(mutableListOf(java,kotlin,python,spring,django,mysql,redis,kafka))

        val project1 = Project(
            name="Finding the lost cat",
            description = "find its place using GPS",
            startYear = 2022,
            startMonth = 3,
            endYear = 2024,
            endMonth = 5,
            isActive = true
        )
        project1.addDetails(
            mutableListOf(
                ProjectDetail(content="Using Google Maps", url=null, isActive=true),
                ProjectDetail(content="we have usd redis", url=null, isActive=true)
            )
        )

        project1.skills.addAll(
            mutableListOf(
                ProjectSkill(project=project1,skill=java),
                ProjectSkill(project=project1,skill=spring),
                ProjectSkill(project=project1,skill=mysql),
                ProjectSkill(project=project1,skill=redis)
            )
        )
        val project2=Project(
            name="Home Camera",
            description = "Send an alarm to client is any movement is detected",
            startYear = 2022,
            startMonth = 3,
            endYear = null,
            endMonth = null,
            isActive = true
        )
        project2.addDetails(
            mutableListOf(
                ProjectDetail(content="Pil 1", url=null, isActive=true),
                ProjectDetail(content="Pil 2", url=null, isActive=true),
                ProjectDetail(content="Pil 3", url="https://android-developer.tistory.com/29", isActive=true)
            )
        )
        project2.skills.addAll(
            mutableListOf(
                ProjectSkill(project=project2, skill=python),
                ProjectSkill(project=project2, skill=django),
                ProjectSkill(project=project2, skill=kafka)
            )
        )
        projectRepository.saveAll(mutableListOf(project1,project2))

    }
}