const jobs = [
    { id:1, isActive: true },
    { id:2, isActive: true },
    { id:3, isActive: false}
]

const inActiveJobs = jobs.filter(function (job) {
    return !(job.isActive)
})

const activeJobs = jobs.filter(job => job.isActive)

console.log(inActiveJobs)
console.log(activeJobs);

// Arrow functions don't define this.